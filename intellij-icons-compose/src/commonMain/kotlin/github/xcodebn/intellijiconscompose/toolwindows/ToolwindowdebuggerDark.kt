package github.xcodebn.intellijiconscompose.toolwindows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ToolwindowdebuggerDark: ImageVector
    get() {
        if (_ToolwindowdebuggerDark != null) return _ToolwindowdebuggerDark!!

        _ToolwindowdebuggerDark = ImageVector.Builder(
            name = "ToolwindowdebuggerDark",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 8f)
                lineTo(12f, 8f)
                lineTo(12f, 7f)
                lineTo(10f, 7f)
                lineTo(10f, 6f)
                curveTo(10.19f, 5.63f, 10.16f, 5.49f, 10.14f, 5.34f)
                lineTo(12f, 5f)
                lineTo(12f, 4f)
                lineTo(10f, 4f)
                curveTo(9.32f, 3.38f, 8.79f, 2.89f, 8.15f, 2.58f)
                lineTo(9f, 1f)
                lineTo(8f, 0f)
                lineTo(7f, 2f)
                curveTo(6.58f, 2.21f, 6.52f, 2.20f, 6.50f, 2.20f)
                curveTo(6.45f, 2.20f, 6.46f, 2.21f, 6.41f, 2.21f)
                lineTo(5f, 0f)
                lineTo(4f, 1f)
                lineTo(5f, 3f)
                curveTo(4.28f, 2.93f, 3.77f, 3.40f, 3.42f, 3.99f)
                lineTo(2f, 4f)
                lineTo(2f, 5f)
                lineTo(3f, 5f)
                curveTo(2.94f, 5.49f, 2.91f, 5.63f, 2.91f, 5.79f)
                lineTo(3f, 7f)
                lineTo(2f, 7f)
                lineTo(2f, 8f)
                lineTo(3f, 8f)
                lineTo(3f, 8f)
                curveTo(2.91f, 8.79f, 2.97f, 9.09f, 3.04f, 9.38f)
                lineTo(2f, 9f)
                lineTo(2f, 11f)
                lineTo(4f, 11f)
                curveTo(4.41f, 11.54f, 5.41f, 12.07f, 6.55f, 12.07f)
                curveTo(7.69f, 12.07f, 8.70f, 11.54f, 9.36f, 10.72f)
                lineTo(12f, 11f)
                lineTo(12f, 9f)
                lineTo(10f, 9f)
                curveTo(10.14f, 9.09f, 10.19f, 8.79f, 10.19f, 8.48f)
                lineTo(10f, 8f)
                close()
            }
        }.build()

        return _ToolwindowdebuggerDark!!
    }

private var _ToolwindowdebuggerDark: ImageVector? = null

