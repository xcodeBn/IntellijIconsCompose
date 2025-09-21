package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Smartstepinto: ImageVector
    get() {
        if (_Smartstepinto != null) return _Smartstepinto!!

        _Smartstepinto = ImageVector.Builder(
            name = "Smartstepinto",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF389FD6))
            ) {
                moveTo(12f, 7f)
                lineTo(15f, 7f)
                close()
                moveTo(3f, 1f)
                lineTo(5f, 1f)
                close()
                moveTo(1f, 5f)
                lineTo(7f, 5f)
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF389FD6))
                ) {
                    moveTo(12f, 7f)
                    lineTo(15f, 7f)
                    close()
                    moveTo(3f, 1f)
                    lineTo(5f, 1f)
                    close()
                    moveTo(1f, 5f)
                    lineTo(7f, 5f)
                }
            }
        }.build()

        return _Smartstepinto!!
    }

private var _Smartstepinto: ImageVector? = null

