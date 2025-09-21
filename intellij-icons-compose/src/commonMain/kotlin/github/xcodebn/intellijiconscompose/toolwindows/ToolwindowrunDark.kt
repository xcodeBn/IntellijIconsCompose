package github.xcodebn.intellijiconscompose.toolwindows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ToolwindowrunDark: ImageVector
    get() {
        if (_ToolwindowrunDark != null) return _ToolwindowrunDark!!

        _ToolwindowrunDark = ImageVector.Builder(
            name = "ToolwindowrunDark",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 1f)
                lineTo(10f, 6f)
                lineTo(2f, 11f)
                close()
            }
        }.build()

        return _ToolwindowrunDark!!
    }

private var _ToolwindowrunDark: ImageVector? = null

