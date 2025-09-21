package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DbExceptionBreakpointDark: ImageVector
    get() {
        if (_DbExceptionBreakpointDark != null) return _DbExceptionBreakpointDark!!

        _DbExceptionBreakpointDark = ImageVector.Builder(
            name = "DbExceptionBreakpointDark",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFC75450))
            ) {
                moveTo(6f, 7f)
                lineTo(2f, 10f)
                lineTo(2f, 1f)
                lineTo(5f, -1f)
                lineTo(5f, 4f)
                lineTo(10f, 1f)
                lineTo(7f, 12f)
                close()
            }
        }.build()

        return _DbExceptionBreakpointDark!!
    }

private var _DbExceptionBreakpointDark: ImageVector? = null

