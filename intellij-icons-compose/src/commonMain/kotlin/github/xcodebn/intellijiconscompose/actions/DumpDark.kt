package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DumpDark: ImageVector
    get() {
        if (_DumpDark != null) return _DumpDark!!

        _DumpDark = ImageVector.Builder(
            name = "DumpDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 2f)
                lineTo(14f, 2f)
                lineTo(14f, 12f)
                lineTo(0f, 12f)
                lineTo(0f, 2f)
                close()
                moveTo(7f, 10f)
                curveTo(8.93f, 10.50f, 10.50f, 8.93f, 10.50f, 7.00f)
                curveTo(10.50f, 5.07f, 8.93f, 3.50f, 7.00f, 3.50f)
                curveTo(5.07f, 3.50f, 3.50f, 5.07f, 3.50f, 7.00f)
                curveTo(3.50f, 8.93f, 5.07f, 10.50f, 7.00f, 10.50f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 0f)
                lineTo(9f, 0f)
                lineTo(10f, 2f)
                lineTo(4f, 2f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(0f, 2f)
                    lineTo(14f, 2f)
                    lineTo(14f, 12f)
                    lineTo(0f, 12f)
                    lineTo(0f, 2f)
                    close()
                    moveTo(7f, 10f)
                    curveTo(8.93f, 10.50f, 10.50f, 8.93f, 10.50f, 7.00f)
                    curveTo(10.50f, 5.07f, 8.93f, 3.50f, 7.00f, 3.50f)
                    curveTo(5.07f, 3.50f, 3.50f, 5.07f, 3.50f, 7.00f)
                    curveTo(3.50f, 8.93f, 5.07f, 10.50f, 7.00f, 10.50f)
                    close()
                }
            }
        }.build()

        return _DumpDark!!
    }

private var _DumpDark: ImageVector? = null

