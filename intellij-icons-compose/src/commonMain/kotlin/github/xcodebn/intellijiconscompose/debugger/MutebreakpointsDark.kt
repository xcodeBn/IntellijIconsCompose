package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MutebreakpointsDark: ImageVector
    get() {
        if (_MutebreakpointsDark != null) return _MutebreakpointsDark!!

        _MutebreakpointsDark = ImageVector.Builder(
            name = "MutebreakpointsDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFC75450))
            ) {
                moveTo(3f, 13f)
                curveTo(1.33f, 11.94f, 0.00f, 10.13f, 0.00f, 8.00f)
                curveTo(0.00f, 5.87f, 1.33f, 4.06f, 3.20f, 3.33f)
                lineTo(3f, 13f)
                close()
                moveTo(7f, 3f)
                curveTo(8.67f, 4.06f, 10.00f, 5.87f, 10.00f, 8.00f)
                curveTo(10.00f, 10.13f, 8.67f, 11.94f, 6.80f, 12.67f)
                lineTo(7f, 3f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFC75450))
                ) {
                    moveTo(3f, 13f)
                    curveTo(1.33f, 11.94f, 0.00f, 10.13f, 0.00f, 8.00f)
                    curveTo(0.00f, 5.87f, 1.33f, 4.06f, 3.20f, 3.33f)
                    lineTo(3f, 13f)
                    close()
                    moveTo(7f, 3f)
                    curveTo(8.67f, 4.06f, 10.00f, 5.87f, 10.00f, 8.00f)
                    curveTo(10.00f, 10.13f, 8.67f, 11.94f, 6.80f, 12.67f)
                    lineTo(7f, 3f)
                    close()
                }
            }
        }.build()

        return _MutebreakpointsDark!!
    }

private var _MutebreakpointsDark: ImageVector? = null

