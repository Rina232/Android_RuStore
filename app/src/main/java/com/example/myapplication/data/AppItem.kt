package com.example.myapplication.data

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.VkEducationTheme


data class AppItem(
    val name: String,
    val iconId: Int,
    val description: String,
    val category: String
)

@Composable
fun AppItemCard(app: AppItem, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(app.iconId),
            contentDescription = app.name,
            modifier = Modifier
                .size(60.dp)
                .clip(RoundedCornerShape(16.dp)),
            tint = Color.Unspecified
        )
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(start = 20.dp)
        ) {
            Text(
                text = app.name,
                style = MaterialTheme.typography.titleMedium.copy(
                    fontSize = 17.sp
                ),
                maxLines = 1
            )
            Text(
                text = app.description,
                style = MaterialTheme.typography.bodySmall,
                maxLines = 1
            )
            Text(
                text = app.category,
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(top=4.dp),
                color = Color.Gray,
                maxLines = 1
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun AppItemCardPreview() {
    VkEducationTheme {
        AppItemCard(
                AppItem(
                    name = "СберБанк Онлайн - с Салютом",
                    iconId = R.drawable.ic_sber,
                    description = "Больше чем банк",
                    category = "Финансы"
                )
        )
    }
}