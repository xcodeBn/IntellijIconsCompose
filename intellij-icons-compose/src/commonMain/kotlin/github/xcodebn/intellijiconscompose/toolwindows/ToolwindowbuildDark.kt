package github.xcodebn.intellijiconscompose.toolwindows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ToolwindowbuildDark: ImageVector
    get() {
        if (_ToolwindowbuildDark != null) return _ToolwindowbuildDark!!

        _ToolwindowbuildDark = ImageVector.Builder(
            name = "ToolwindowbuildDark",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 0f)
                lineTo(10f, 0f)
                lineTo(12f, 2f)
                lineTo(11f, 3f)
                lineTo(10f, 3f)
                lineTo(8f, 2f)
                lineTo(8f, 6f)
                lineTo(9f, 7f)
                lineTo(9f, 13f)
                lineTo(6f, 13f)
                lineTo(6f, 7f)
                lineTo(6f, 6f)
                lineTo(6f, 2f)
                lineTo(6f, 3f)
                lineTo(6f, 3f)
                lineTo(3f, 3f)
                lineTo(3f, 0f)
                lineTo(5f, 0f)
                lineTo(6f, 1f)
                lineTo(6f, 1f)
                curveTo(5.91f, 0.39f, 6.06f, 0.31f, 6.22f, 0.31f)
                lineTo(10f, 0f)
                lineTo(10f, 0f)
                close()
            }
        }.build()

        return _ToolwindowbuildDark!!
    }

private var _ToolwindowbuildDark: ImageVector? = null

