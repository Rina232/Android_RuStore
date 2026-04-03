package com.example.myapplication.ui.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.LightBackground
import com.example.myapplication.ui.theme.RuStoreBlue
import com.example.myapplication.ui.theme.VkEducationTheme

@Composable
fun AppListScreen(apps: List<AppItem>) {
    Column(Modifier
        .fillMaxSize()
        .background(RuStoreBlue)) {
        Row(Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 20.dp)
            .padding(top = 45.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Icon(
                painter = painterResource(R.drawable.logo),
                contentDescription = "Логотип",
                modifier = Modifier.width(130.dp),
                tint = Color.Unspecified
            )
            Icon(
                imageVector = ImageVector.vectorResource(R.drawable.ic_menu),
                contentDescription = "Меню",
                modifier = Modifier
                    .height(35.dp)
                    .width(35.dp),
                tint = Color.Unspecified
            )
        }
        LazyColumn(
            modifier = Modifier
                .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                .background(LightBackground)
                .fillMaxSize(),
            contentPadding = PaddingValues(16.dp)
        ) {
            items(apps) { app ->
                AppItemCard(app = app)
                if (app != apps.last()) {
                    HorizontalDivider(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 12.dp),
                        thickness = 0.5.dp,
                        color = Color.LightGray
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun AppListScreenPreview() {
    VkEducationTheme {
        AppListScreen(
            apps = listOf(
                AppItem(
                    name = "СберБанк Онлайн - с Салютом",
                    iconId = R.drawable.ic_sber,
                    description = "Больше чем банк",
                    category = "Финансы"
                ),
                AppItem(
                    name = "Яндекс.Браузер - с Алисой",
                    iconId = R.drawable.ic_yandex_browser,
                    description = "Быстрый и безопасный браузер",
                    category = "Инструменты"
                ),
                AppItem(
                    name = "Почта Mail.ru",
                    iconId = R.drawable.ic_mail,
                    description = "Почтовый клиент для любых ящиков",
                    category = "Инструменты"
                ),
                AppItem(
                    name = "Яндекс Навигатор",
                    iconId = R.drawable.ic_yandex_navigator,
                    description = "Парковки и заправки - по пути",
                    category = "Транспорт"
                ),
                AppItem(
                    name = "Мой МТС",
                    iconId = R.drawable.ic_mts,
                    description = "Мой МТС - центр экосистемы МТС",
                    category = "Инструменты"
                ),
                AppItem(
                    name = "Яндекс - с Алисой",
                    iconId = R.drawable.ic_yandex,
                    description = "Яндекс - поиск всегда под рукой",
                    category = "Инструменты"
                ),
                AppItem(
                    name = "WILDBERRIES",
                    iconId = R.drawable.ic_wildberries,
                    description = "Акции каждый день",
                    category = "Покупки"
                ),
                AppItem(
                    name = "Самокат",
                    iconId = R.drawable.ic_samokat,
                    description = "Быстрая доставка еды и продуктов на дом",
                    category = "Еда и напитки"
                ),
                AppItem(
                    name = "OZON",
                    iconId = R.drawable.ic_ozon,
                    description = "Товары, одежда, билеты",
                    category = "Покупки"
                ),
            )
        )
    }
}