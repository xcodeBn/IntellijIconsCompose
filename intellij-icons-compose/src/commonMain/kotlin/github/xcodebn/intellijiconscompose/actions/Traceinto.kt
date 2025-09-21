package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Traceinto: ImageVector
    get() {
        if (_Traceinto != null) return _Traceinto!!

        _Traceinto = ImageVector.Builder(
            name = "Traceinto",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF389FD6))
            ) {
                moveTo(9f, 6f)
                lineTo(13f, 6f)
                lineTo(8f, 11f)
                lineTo(3f, 6f)
                lineTo(7f, 6f)
                lineTo(7f, 1f)
                lineTo(9f, 1f)
                lineTo(9f, 6f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF389FD6))
                ) {
                    moveTo(9f, 6f)
                    lineTo(13f, 6f)
                    lineTo(8f, 11f)
                    lineTo(3f, 6f)
                    lineTo(7f, 6f)
                    lineTo(7f, 1f)
                    lineTo(9f, 1f)
                    lineTo(9f, 6f)
                    close()
                }
            }
        }.build()

        return _Traceinto!!
    }

private var _Traceinto: ImageVector? = null

