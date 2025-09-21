package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ViewbreakpointsDark: ImageVector
    get() {
        if (_ViewbreakpointsDark != null) return _ViewbreakpointsDark!!

        _ViewbreakpointsDark = ImageVector.Builder(
            name = "ViewbreakpointsDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFC75450))
            ) {
                moveTo(6f, 4f)
                curveTo(7.20f, 2.02f, 8.73f, 1.00f, 10.50f, 1.00f)
                curveTo(12.99f, 1.00f, 15.00f, 3.01f, 15.00f, 5.50f)
                curveTo(15.00f, 7.27f, 13.98f, 8.80f, 12.50f, 9.53f)
                curveTo(12.50f, 9.52f, 12.50f, 9.51f, 12.50f, 9.50f)
                curveTo(12.50f, 6.19f, 9.81f, 3.50f, 6.50f, 3.50f)
                curveTo(6.49f, 3.50f, 6.48f, 3.50f, 6.47f, 3.50f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFC75450))
                ) {
                    moveTo(6f, 4f)
                    curveTo(7.20f, 2.02f, 8.73f, 1.00f, 10.50f, 1.00f)
                    curveTo(12.99f, 1.00f, 15.00f, 3.01f, 15.00f, 5.50f)
                    curveTo(15.00f, 7.27f, 13.98f, 8.80f, 12.50f, 9.53f)
                    curveTo(12.50f, 9.52f, 12.50f, 9.51f, 12.50f, 9.50f)
                    curveTo(12.50f, 6.19f, 9.81f, 3.50f, 6.50f, 3.50f)
                    curveTo(6.49f, 3.50f, 6.48f, 3.50f, 6.47f, 3.50f)
                    close()
                }
            }
        }.build()

        return _ViewbreakpointsDark!!
    }

private var _ViewbreakpointsDark: ImageVector? = null

