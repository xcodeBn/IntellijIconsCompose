package github.xcodebn.intellijiconscompose.toolwindows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ToolwindowfindDark: ImageVector
    get() {
        if (_ToolwindowfindDark != null) return _ToolwindowfindDark!!

        _ToolwindowfindDark = ImageVector.Builder(
            name = "ToolwindowfindDark",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 10f)
                curveTo(2.63f, 10.00f, 0.50f, 7.87f, 0.50f, 5.25f)
                curveTo(0.50f, 2.63f, 2.63f, 0.50f, 5.25f, 0.50f)
                curveTo(7.87f, 0.50f, 10.00f, 2.63f, 10.00f, 5.25f)
                curveTo(10.00f, 7.87f, 7.87f, 10.00f, 5.25f, 10.00f)
                close()
                moveTo(5f, 8f)
                curveTo(6.82f, 8.10f, 8.10f, 6.82f, 8.10f, 5.25f)
                curveTo(8.10f, 3.68f, 6.82f, 2.40f, 5.25f, 2.40f)
                curveTo(3.68f, 2.40f, 2.40f, 3.68f, 2.40f, 5.25f)
                curveTo(2.40f, 6.82f, 3.68f, 8.10f, 5.25f, 8.10f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(5f, 10f)
                    curveTo(2.63f, 10.00f, 0.50f, 7.87f, 0.50f, 5.25f)
                    curveTo(0.50f, 2.63f, 2.63f, 0.50f, 5.25f, 0.50f)
                    curveTo(7.87f, 0.50f, 10.00f, 2.63f, 10.00f, 5.25f)
                    curveTo(10.00f, 7.87f, 7.87f, 10.00f, 5.25f, 10.00f)
                    close()
                    moveTo(5f, 8f)
                    curveTo(6.82f, 8.10f, 8.10f, 6.82f, 8.10f, 5.25f)
                    curveTo(8.10f, 3.68f, 6.82f, 2.40f, 5.25f, 2.40f)
                    curveTo(3.68f, 2.40f, 2.40f, 3.68f, 2.40f, 5.25f)
                    curveTo(2.40f, 6.82f, 3.68f, 8.10f, 5.25f, 8.10f)
                    close()
                }
            }
        }.build()

        return _ToolwindowfindDark!!
    }

private var _ToolwindowfindDark: ImageVector? = null

