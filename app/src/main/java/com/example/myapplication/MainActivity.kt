package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.myapplication.ui.main.AppItem
import com.example.myapplication.ui.main.AppListScreen
import com.example.myapplication.ui.theme.VkEducationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            VkEducationTheme() {
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
                        )
                    )
                )
            }
        }
    }
}
