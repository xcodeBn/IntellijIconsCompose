package github.xcodebn.intellijiconscompose.diff

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RevertDark: ImageVector
    get() {
        if (_RevertDark != null) return _RevertDark!!

        _RevertDark = ImageVector.Builder(
            name = "RevertDark",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(1f, 4f)
                lineTo(4f, 6f)
                lineTo(4f, 7f)
                lineTo(0f, 4f)
                lineTo(4f, 0f)
                lineTo(4f, 1f)
                lineTo(1f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(5f, 11f)
                lineTo(8f, 11f)
                curveTo(9.66f, 11.00f, 11.00f, 9.66f, 11.00f, 8.00f)
                curveTo(11.00f, 6.34f, 9.66f, 5.00f, 8.00f, 5.00f)
                lineTo(1f, 5f)
                lineTo(1f, 4f)
                lineTo(8f, 4f)
                curveTo(10.21f, 4.00f, 12.00f, 5.79f, 12.00f, 8.00f)
                curveTo(12.00f, 10.21f, 10.21f, 12.00f, 8.00f, 12.00f)
                lineTo(5f, 12f)
                lineTo(5f, 11f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(1f, 4f)
                    lineTo(4f, 6f)
                    lineTo(4f, 7f)
                    lineTo(0f, 4f)
                    lineTo(4f, 0f)
                    lineTo(4f, 1f)
                    lineTo(1f, 4f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(5f, 11f)
                    lineTo(8f, 11f)
                    curveTo(9.66f, 11.00f, 11.00f, 9.66f, 11.00f, 8.00f)
                    curveTo(11.00f, 6.34f, 9.66f, 5.00f, 8.00f, 5.00f)
                    lineTo(1f, 5f)
                    lineTo(1f, 4f)
                    lineTo(8f, 4f)
                    curveTo(10.21f, 4.00f, 12.00f, 5.79f, 12.00f, 8.00f)
                    curveTo(12.00f, 10.21f, 10.21f, 12.00f, 8.00f, 12.00f)
                    lineTo(5f, 12f)
                    lineTo(5f, 11f)
                    close()
                }
            }
        }.build()

        return _RevertDark!!
    }

private var _RevertDark: ImageVector? = null

