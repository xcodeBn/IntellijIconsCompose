package github.xcodebn.intellijiconscompose.windows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Restoresmall: ImageVector
    get() {
        if (_Restoresmall != null) return _Restoresmall!!

        _Restoresmall = ImageVector.Builder(
            name = "Restoresmall",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(4f, 6f)
                lineTo(4f, 5f)
                lineTo(5f, 5f)
                lineTo(5f, 1f)
                lineTo(1f, 1f)
                lineTo(1f, 2f)
                lineTo(0f, 2f)
                lineTo(0f, 0f)
                lineTo(6f, 0f)
                lineTo(6f, 6f)
                lineTo(4f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(0f, 0f)
                lineTo(6f, 0f)
                lineTo(6f, 6f)
                lineTo(0f, 6f)
                lineTo(0f, 0f)
                close()
                moveTo(1f, 1f)
                lineTo(1f, 5f)
                lineTo(5f, 5f)
                lineTo(5f, 1f)
                lineTo(1f, 1f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(4f, 6f)
                    lineTo(4f, 5f)
                    lineTo(5f, 5f)
                    lineTo(5f, 1f)
                    lineTo(1f, 1f)
                    lineTo(1f, 2f)
                    lineTo(0f, 2f)
                    lineTo(0f, 0f)
                    lineTo(6f, 0f)
                    lineTo(6f, 6f)
                    lineTo(4f, 6f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(0f, 0f)
                    lineTo(6f, 0f)
                    lineTo(6f, 6f)
                    lineTo(0f, 6f)
                    lineTo(0f, 0f)
                    close()
                    moveTo(1f, 1f)
                    lineTo(1f, 5f)
                    lineTo(5f, 5f)
                    lineTo(5f, 1f)
                    lineTo(1f, 1f)
                    close()
                }
            }
        }.build()

        return _Restoresmall!!
    }

private var _Restoresmall: ImageVector? = null

