package com.nguyenhoangthanhan.loginflow.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nguyenhoangthanhan.loginflow.R
import com.nguyenhoangthanhan.loginflow.components.ButtonComponent
import com.nguyenhoangthanhan.loginflow.components.ClickableLoginTextComponent
import com.nguyenhoangthanhan.loginflow.components.DividerTextComponent
import com.nguyenhoangthanhan.loginflow.components.HeadingTextComponent
import com.nguyenhoangthanhan.loginflow.components.MyPasswordTextFieldComponent
import com.nguyenhoangthanhan.loginflow.components.MyTextFieldComponent
import com.nguyenhoangthanhan.loginflow.components.NormalTextComponent
import com.nguyenhoangthanhan.loginflow.components.UnderLinedTextComponent
import com.nguyenhoangthanhan.loginflow.navigation.PostOfficeAppRouter
import com.nguyenhoangthanhan.loginflow.navigation.Screen
import com.nguyenhoangthanhan.loginflow.navigation.SystemBackButtonHandler

@Composable
fun LoginScreen() {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column (
            modifier = Modifier
                .fillMaxSize()
        ){
            NormalTextComponent(value = stringResource(id = R.string.login))
            HeadingTextComponent(value = stringResource(id = R.string.welcome_back))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource = painterResource(id = R.drawable.icon_mail_outline),
                onTextSelected = {

                },
                true
            )
            MyPasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.icon_password),
                onTextSelected = {

                },
                true
            )
            Spacer(modifier = Modifier.height(40.dp))
            UnderLinedTextComponent(value = stringResource(id = R.string.forgot_password))
            Spacer(modifier = Modifier.height(40.dp))
            ButtonComponent(
                value = stringResource(id = R.string.login),
                onButtonClicked = {

                }
            )
            Spacer(modifier = Modifier.height(20.dp))
            DividerTextComponent()
            ClickableLoginTextComponent(tryingToLogin = false, onTextSelected = {
                PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
            })
        }

        SystemBackButtonHandler {
            PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
        }
    }
}

@Preview
@Composable
fun DefaultPreviewOfLoginScreen() {
    LoginScreen()
}