package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DbNoSuspendFieldBreakpoint: ImageVector
    get() {
        if (_DbNoSuspendFieldBreakpoint != null) return _DbNoSuspendFieldBreakpoint!!

        _DbNoSuspendFieldBreakpoint = ImageVector.Builder(
            name = "DbNoSuspendFieldBreakpoint",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 6f)
                curveTo(1.07f, 3.64f, 3.35f, 2.00f, 6.00f, 2.00f)
                curveTo(8.65f, 2.00f, 10.93f, 3.64f, 12.00f, 6.00f)
                curveTo(10.93f, 8.36f, 8.65f, 10.00f, 6.00f, 10.00f)
                curveTo(3.35f, 10.00f, 1.07f, 8.36f, 0.00f, 6.00f)
                close()
                moveTo(6f, 9f)
                curveTo(7.66f, 9.00f, 9.00f, 7.66f, 9.00f, 6.00f)
                curveTo(9.00f, 4.34f, 7.66f, 3.00f, 6.00f, 3.00f)
                curveTo(4.34f, 3.00f, 3.00f, 4.34f, 3.00f, 6.00f)
                curveTo(3.00f, 7.66f, 4.34f, 9.00f, 6.00f, 9.00f)
                close()
                moveTo(6f, 8f)
                curveTo(4.90f, 8.00f, 4.00f, 7.10f, 4.00f, 6.00f)
                curveTo(4.00f, 4.90f, 4.90f, 4.00f, 6.00f, 4.00f)
                curveTo(7.10f, 4.00f, 8.00f, 4.90f, 8.00f, 6.00f)
                curveTo(8.00f, 7.10f, 7.10f, 8.00f, 6.00f, 8.00f)
                close()
            }
        }.build()

        return _DbNoSuspendFieldBreakpoint!!
    }

private var _DbNoSuspendFieldBreakpoint: ImageVector? = null

