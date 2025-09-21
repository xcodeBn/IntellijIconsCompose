package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Runtocursor: ImageVector
    get() {
        if (_Runtocursor != null) return _Runtocursor!!

        _Runtocursor = ImageVector.Builder(
            name = "Runtocursor",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF389FD6))
            ) {
                moveTo(7f, 6f)
                lineTo(10f, 6f)
                lineTo(6f, 10f)
                lineTo(1f, 6f)
                lineTo(5f, 6f)
                lineTo(5f, 1f)
                lineTo(7f, 1f)
                lineTo(7f, 6f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF389FD6))
                ) {
                    moveTo(7f, 6f)
                    lineTo(10f, 6f)
                    lineTo(6f, 10f)
                    lineTo(1f, 6f)
                    lineTo(5f, 6f)
                    lineTo(5f, 1f)
                    lineTo(7f, 1f)
                    lineTo(7f, 6f)
                    close()
                }
            }
        }.build()

        return _Runtocursor!!
    }

private var _Runtocursor: ImageVector? = null

