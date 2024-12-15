package com.example.nearby.ui.screens.welcome

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nearby.R
import com.example.nearby.ui.components.button.NearbyButton
import com.example.nearby.ui.theme.Gray500
import com.example.nearby.ui.theme.RedBase
import com.example.nearby.ui.theme.Typography

@Composable
fun WelcomeScreen(
    modifier: Modifier = Modifier,
    onNavigateToHome: () -> Unit
) {
    Column(
        modifier = modifier
            .background(Color.White)
            .fillMaxSize()
            .padding(horizontal = 40.dp, vertical = 48.dp)
            .verticalScroll(state = rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        WelcomeHeader()
        WelcomeContent()
        NearbyButton(
            modifier = Modifier.fillMaxWidth(),
            text = "Começar",
            onClick = {
                onNavigateToHome()
            }
        )
    }
}

@Composable
fun WelcomeHeader(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.img_logo_logo_icon),
            contentDescription = "Nearby app logo"
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Boas vindas ao Nearby!", style = Typography.headlineLarge)
        Text(
            text = "Tenha cupons de vantagens para usar em seus estabelecimentos favoritos.",
            style = Typography.bodyLarge
        )
    }
}

@Composable
fun WelcomeContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Text(text = "Veja como funciona:", style = Typography.bodyLarge)
        WelcomeHowItWorksTip(
            modifier = modifier.fillMaxWidth(),
            iconRes = R.drawable.ic_map_pin,
            title = "Encontre estabelecimentos",
            subtitle = "Veja locais perto de você que são parceiro Nearby"
        )
        WelcomeHowItWorksTip(
            modifier = modifier.fillMaxWidth(),
            iconRes = R.drawable.ic_qrcode,
            title = "Ative o cupom com QR Code",
            subtitle = "Escaneie o código no estabelecimento para usar o benefício"
        )
        WelcomeHowItWorksTip(
            modifier = modifier.fillMaxWidth(),
            iconRes = R.drawable.ic_ticket,
            title = "Garanta vantagens perto de você",
            subtitle = "Ative cupons onde estiver, em diferentes tipos de estabelecimentos"
        )
    }
}

@Composable
fun WelcomeHowItWorksTip(
    modifier: Modifier = Modifier,
    @DrawableRes iconRes: Int,
    title: String,
    subtitle: String
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        Icon(
            modifier = Modifier.size(32.dp),
            tint = RedBase,
            painter = painterResource(iconRes),
            contentDescription = "Ícone"
        )
        Column(
            modifier = modifier,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(text = title, style = Typography.headlineSmall)
            Text(
                text = subtitle,
                color = Gray500,
                style = Typography.bodyLarge
            )
        }
    }
}

@Preview
@Composable
private fun WelcomeScreenPreview() {
    WelcomeScreen(onNavigateToHome = {})
}