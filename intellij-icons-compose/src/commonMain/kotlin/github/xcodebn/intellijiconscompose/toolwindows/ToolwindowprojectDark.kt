package github.xcodebn.intellijiconscompose.toolwindows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ToolwindowprojectDark: ImageVector
    get() {
        if (_ToolwindowprojectDark != null) return _ToolwindowprojectDark!!

        _ToolwindowprojectDark = ImageVector.Builder(
            name = "ToolwindowprojectDark",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 4f)
                lineTo(12f, 4f)
                lineTo(12f, 11f)
                lineTo(1f, 11f)
                lineTo(1f, 4f)
                lineTo(1f, 2f)
                lineTo(6f, 2f)
                lineTo(7f, 4f)
                close()
            }
        }.build()

        return _ToolwindowprojectDark!!
    }

private var _ToolwindowprojectDark: ImageVector? = null

