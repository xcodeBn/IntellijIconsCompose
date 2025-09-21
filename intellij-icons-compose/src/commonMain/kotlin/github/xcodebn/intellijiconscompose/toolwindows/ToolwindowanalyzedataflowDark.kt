package github.xcodebn.intellijiconscompose.toolwindows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ToolwindowanalyzedataflowDark: ImageVector
    get() {
        if (_ToolwindowanalyzedataflowDark != null) return _ToolwindowanalyzedataflowDark!!

        _ToolwindowanalyzedataflowDark = ImageVector.Builder(
            name = "ToolwindowanalyzedataflowDark",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(9f, 12f)
                lineTo(6f, 8f)
                lineTo(12f, 8f)
                lineTo(9f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(4f, 1f)
                lineTo(7f, 5f)
                horizontalLineTo(1f)
                lineTo(4f, 1f)
                close()
            }
        }.build()

        return _ToolwindowanalyzedataflowDark!!
    }

private var _ToolwindowanalyzedataflowDark: ImageVector? = null

