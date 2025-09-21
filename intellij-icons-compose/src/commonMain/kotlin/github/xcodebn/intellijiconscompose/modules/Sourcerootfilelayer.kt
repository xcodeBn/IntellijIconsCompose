package github.xcodebn.intellijiconscompose.modules

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Sourcerootfilelayer: ImageVector
    get() {
        if (_Sourcerootfilelayer != null) return _Sourcerootfilelayer!!

        _Sourcerootfilelayer = ImageVector.Builder(
            name = "Sourcerootfilelayer",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {

        }.build()

        return _Sourcerootfilelayer!!
    }

private var _Sourcerootfilelayer: ImageVector? = null

