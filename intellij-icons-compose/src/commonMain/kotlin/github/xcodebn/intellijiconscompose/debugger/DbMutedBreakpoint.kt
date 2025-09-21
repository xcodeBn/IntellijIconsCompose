package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DbMutedBreakpoint: ImageVector
    get() {
        if (_DbMutedBreakpoint != null) return _DbMutedBreakpoint!!

        _DbMutedBreakpoint = ImageVector.Builder(
            name = "DbMutedBreakpoint",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {

        }.build()

        return _DbMutedBreakpoint!!
    }

private var _DbMutedBreakpoint: ImageVector? = null

