package github.xcodebn.intellijiconscompose.gutter

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RecursivemethodDark: ImageVector
    get() {
        if (_RecursivemethodDark != null) return _RecursivemethodDark!!

        _RecursivemethodDark = ImageVector.Builder(
            name = "RecursivemethodDark",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(3f, 2f)
                lineTo(4f, 3f)
                curveTo(2.77f, 3.28f, 2.00f, 4.55f, 2.00f, 6.00f)
                curveTo(2.00f, 8.21f, 3.79f, 10.00f, 6.00f, 10.00f)
                curveTo(8.21f, 10.00f, 10.00f, 8.21f, 10.00f, 6.00f)
                curveTo(10.00f, 4.41f, 9.07f, 3.03f, 7.72f, 2.39f)
                lineTo(9f, 2f)
                curveTo(10.10f, 2.70f, 11.00f, 4.24f, 11.00f, 6.00f)
                curveTo(11.00f, 8.76f, 8.76f, 11.00f, 6.00f, 11.00f)
                curveTo(3.24f, 11.00f, 1.00f, 8.76f, 1.00f, 6.00f)
                curveTo(1.00f, 4.18f, 1.97f, 2.59f, 3.42f, 1.71f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(7f, 1f)
                lineTo(11f, 1f)
                lineTo(7f, 5f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(3f, 2f)
                    lineTo(4f, 3f)
                    curveTo(2.77f, 3.28f, 2.00f, 4.55f, 2.00f, 6.00f)
                    curveTo(2.00f, 8.21f, 3.79f, 10.00f, 6.00f, 10.00f)
                    curveTo(8.21f, 10.00f, 10.00f, 8.21f, 10.00f, 6.00f)
                    curveTo(10.00f, 4.41f, 9.07f, 3.03f, 7.72f, 2.39f)
                    lineTo(9f, 2f)
                    curveTo(10.10f, 2.70f, 11.00f, 4.24f, 11.00f, 6.00f)
                    curveTo(11.00f, 8.76f, 8.76f, 11.00f, 6.00f, 11.00f)
                    curveTo(3.24f, 11.00f, 1.00f, 8.76f, 1.00f, 6.00f)
                    curveTo(1.00f, 4.18f, 1.97f, 2.59f, 3.42f, 1.71f)
                    close()
                }
            }
        }.build()

        return _RecursivemethodDark!!
    }

private var _RecursivemethodDark: ImageVector? = null

