package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Moveto2Dark: ImageVector
    get() {
        if (_Moveto2Dark != null) return _Moveto2Dark!!

        _Moveto2Dark = ImageVector.Builder(
            name = "Moveto2Dark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 3f)
                lineTo(3f, 5f)
                lineTo(2f, 5f)
                lineTo(2f, 10f)
                lineTo(7f, 10f)
                lineTo(7f, 9f)
                lineTo(9f, 7f)
                lineTo(9f, 12f)
                lineTo(0f, 12f)
                lineTo(0f, 3f)
                lineTo(5f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 2f)
                lineTo(6f, 8f)
                lineTo(0f, 8f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(5f, 3f)
                    lineTo(3f, 5f)
                    lineTo(2f, 5f)
                    lineTo(2f, 10f)
                    lineTo(7f, 10f)
                    lineTo(7f, 9f)
                    lineTo(9f, 7f)
                    lineTo(9f, 12f)
                    lineTo(0f, 12f)
                    lineTo(0f, 3f)
                    lineTo(5f, 3f)
                    close()
                }
            }
        }.build()

        return _Moveto2Dark!!
    }

private var _Moveto2Dark: ImageVector? = null

