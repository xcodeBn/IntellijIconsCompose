package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Warningdecorator: ImageVector
    get() {
        if (_Warningdecorator != null) return _Warningdecorator!!

        _Warningdecorator = ImageVector.Builder(
            name = "Warningdecorator",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFEDA200))
            ) {
                moveTo(12f, 0f)
                lineTo(16f, 7f)
                lineTo(8f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(12f, 6f)
                lineTo(12f, 6f)
                lineTo(12f, 5f)
                lineTo(12f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(12f, 5f)
                lineTo(12f, 5f)
                lineTo(12f, 2f)
                lineTo(12f, 2f)
                close()
            }
        }.build()

        return _Warningdecorator!!
    }

private var _Warningdecorator: ImageVector? = null

