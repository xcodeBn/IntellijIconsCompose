package github.xcodebn.intellijiconscompose.toolwindows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ToolwindowproblemsDark: ImageVector
    get() {
        if (_ToolwindowproblemsDark != null) return _ToolwindowproblemsDark!!

        _ToolwindowproblemsDark = ImageVector.Builder(
            name = "ToolwindowproblemsDark",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFC75450)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 11f)
                curveTo(9.47f, 11.00f, 11.80f, 8.67f, 11.80f, 5.80f)
                curveTo(11.80f, 2.93f, 9.47f, 0.60f, 6.60f, 0.60f)
                curveTo(3.73f, 0.60f, 1.40f, 2.93f, 1.40f, 5.80f)
                curveTo(1.40f, 8.67f, 3.73f, 11.00f, 6.60f, 11.00f)
                close()
                moveTo(6f, 2f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                verticalLineTo(2f)
                close()
                moveTo(8f, 7f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _ToolwindowproblemsDark!!
    }

private var _ToolwindowproblemsDark: ImageVector? = null

