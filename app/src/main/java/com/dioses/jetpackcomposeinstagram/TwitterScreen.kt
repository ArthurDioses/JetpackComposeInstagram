package com.dioses.jetpackcomposeinstagram

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/****
 * Project: JetpackComposeInstagram
 * From: com.dioses.jetpackcomposeinstagram
 * Created by Arthur Dioses Reto on 5/03/24 at 22:43
 * All rights reserved 2024.
 ****/

@Preview
@Composable
fun TwitterScreen() {
    var chat by remember {
        mutableStateOf(false)
    }
    var rt by remember {
        mutableStateOf(false)
    }
    var like by remember {
        mutableStateOf(false)
    }
    Row(
        Modifier
            .fillMaxWidth()
            .background(Color(0xFF161D26))
            .padding(16.dp)
    ) {
        Logo()

        Column(
            Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                TextTitle(title = "Aris", Modifier.padding(8.dp))
                DefaultText(title = "@AristiDevs", Modifier.padding(8.dp))
                DefaultText(title = "4h")
                Spacer(modifier = Modifier.weight(1f))
                Icon(
                    painter = painterResource(id = R.drawable.ic_dots),
                    contentDescription = "more",
                    tint = Color.White,

                    )
            }

            TextBody(
                text = "Descripción larga sobre el texto Descripción larga sobre el texto Descripción larga sobre el texto Descripción larga sobre el texto Descripción larga sobre el texto",
                Modifier.padding(bottom = 16.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "logo",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .clip(RoundedCornerShape(10)),
                contentScale = ContentScale.Crop
            )

            Row(Modifier.padding(top = 16.dp)) {
                SocialIcon(modifier = Modifier.weight(1f), unSelectedIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_chat),
                        contentDescription = "",
                        tint = Color(0xFF7E8B98)
                    )
                }, selectedIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_chat_filled),
                        contentDescription = "",
                        tint = Color(0xFF7E8B98)
                    )
                }, isSelected = chat
                ) {
                    chat = !chat
                }

                SocialIcon(modifier = Modifier.weight(1f), unSelectedIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_rt),
                        contentDescription = "",
                        tint = Color(0xFF7E8B98)
                    )
                }, selectedIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_rt),
                        contentDescription = "",
                        tint = Color(0xFF00FF27)
                    )
                }, isSelected = rt
                ) {
                    rt = !rt

                }

                SocialIcon(modifier = Modifier.weight(1f), unSelectedIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_like),
                        contentDescription = "",
                        tint = Color(0xFF7E8B98)
                    )
                }, selectedIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_like_filled),
                        contentDescription = "",
                        tint = Color(0xEDFF0000)
                    )
                }, isSelected = like
                ) {
                    like = !like

                }
            }
        }
    }
}


@Composable
fun TextBody(text: String, modifier: Modifier = Modifier) {
    Text(text = text, color = Color.White, modifier = modifier)
}

@Composable
fun TextTitle(title: String, modifier: Modifier = Modifier) {
    Text(
        text = title, color = Color.White, fontWeight = FontWeight.ExtraBold, modifier = modifier
    )
}

@Composable
fun DefaultText(title: String, modifier: Modifier = Modifier) {
    Text(
        text = title, color = Color.Gray, modifier = modifier
    )
}

@Composable
fun TuitDivider() {
    Divider(
        Modifier
            .padding(top = 4.dp)
            .height(1.dp)
            .fillMaxWidth(), color = Color(0xFF7E8B98)
    )
}

@Composable
fun SocialIcon(
    modifier: Modifier,
    unSelectedIcon: @Composable () -> Unit,
    selectedIcon: @Composable () -> Unit,
    isSelected: Boolean,
    onItemSelected: () -> Unit
) {
    val defaultValue = 1
    Row(
        modifier = modifier.clickable { onItemSelected() },
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (isSelected) {
            selectedIcon()
        } else {
            unSelectedIcon()
        }
        Text(
            text = if (isSelected) {
                (defaultValue + 1).toString()
            } else {
                defaultValue.toString()
            },
            color = Color(0xFF7E8B98),
            fontSize = 12.sp,
            modifier = Modifier.padding(start = 4.dp)
        )
    }

}

@Composable
fun Logo() {
    Image(
        painter = painterResource(id = R.drawable.profile),
        contentDescription = "logo aris",
        modifier = Modifier
            .clip(CircleShape)
            .size(55.dp)
    )
}
