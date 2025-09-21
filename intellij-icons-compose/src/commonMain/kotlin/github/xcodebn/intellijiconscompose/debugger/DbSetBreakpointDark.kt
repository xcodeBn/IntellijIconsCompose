package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DbSetBreakpointDark: ImageVector
    get() {
        if (_DbSetBreakpointDark != null) return _DbSetBreakpointDark!!

        _DbSetBreakpointDark = ImageVector.Builder(
            name = "DbSetBreakpointDark",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {

        }.build()

        return _DbSetBreakpointDark!!
    }

private var _DbSetBreakpointDark: ImageVector? = null

