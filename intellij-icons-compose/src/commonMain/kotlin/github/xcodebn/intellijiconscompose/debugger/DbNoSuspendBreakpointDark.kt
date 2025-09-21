package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DbNoSuspendBreakpointDark: ImageVector
    get() {
        if (_DbNoSuspendBreakpointDark != null) return _DbNoSuspendBreakpointDark!!

        _DbNoSuspendBreakpointDark = ImageVector.Builder(
            name = "DbNoSuspendBreakpointDark",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {

        }.build()

        return _DbNoSuspendBreakpointDark!!
    }

private var _DbNoSuspendBreakpointDark: ImageVector? = null

