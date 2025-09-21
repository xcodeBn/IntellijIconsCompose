package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DbSetBreakpoint: ImageVector
    get() {
        if (_DbSetBreakpoint != null) return _DbSetBreakpoint!!

        _DbSetBreakpoint = ImageVector.Builder(
            name = "DbSetBreakpoint",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {

        }.build()

        return _DbSetBreakpoint!!
    }

private var _DbSetBreakpoint: ImageVector? = null

