package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DbNoSuspendMethodBreakpoint: ImageVector
    get() {
        if (_DbNoSuspendMethodBreakpoint != null) return _DbNoSuspendMethodBreakpoint!!

        _DbNoSuspendMethodBreakpoint = ImageVector.Builder(
            name = "DbNoSuspendMethodBreakpoint",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                lineTo(10f, 2f)
                lineTo(10f, 10f)
                lineTo(2f, 10f)
                close()
            }
        }.build()

        return _DbNoSuspendMethodBreakpoint!!
    }

private var _DbNoSuspendMethodBreakpoint: ImageVector? = null

