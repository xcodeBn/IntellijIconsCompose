package github.xcodebn.intellijiconscompose.toolwindows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ToolwindowcoverageDark: ImageVector
    get() {
        if (_ToolwindowcoverageDark != null) return _ToolwindowcoverageDark!!

        _ToolwindowcoverageDark = ImageVector.Builder(
            name = "ToolwindowcoverageDark",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 2f)
                lineTo(6f, 10f)
                curveTo(8.54f, 9.33f, 9.61f, 8.09f, 9.72f, 6.69f)
                lineTo(10f, 3f)
                lineTo(6f, 2f)
                close()
                moveTo(2f, 1f)
                lineTo(6f, 0f)
                lineTo(12f, 1f)
                lineTo(12f, 7f)
                curveTo(11.33f, 8.88f, 9.66f, 10.65f, 6.50f, 12.20f)
                curveTo(3.34f, 10.65f, 1.68f, 8.88f, 1.50f, 6.90f)
                lineTo(2f, 1f)
                close()
            }
        }.build()

        return _ToolwindowcoverageDark!!
    }

private var _ToolwindowcoverageDark: ImageVector? = null

