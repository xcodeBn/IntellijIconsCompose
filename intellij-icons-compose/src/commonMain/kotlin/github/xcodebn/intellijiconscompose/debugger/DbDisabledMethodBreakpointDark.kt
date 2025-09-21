package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DbDisabledMethodBreakpointDark: ImageVector
    get() {
        if (_DbDisabledMethodBreakpointDark != null) return _DbDisabledMethodBreakpointDark!!

        _DbDisabledMethodBreakpointDark = ImageVector.Builder(
            name = "DbDisabledMethodBreakpointDark",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, -0f)
                lineTo(12f, 6f)
                lineTo(6f, 12f)
                lineTo(-0f, 6f)
                lineTo(6f, -0f)
                close()
                moveTo(6f, 2f)
                lineTo(2f, 6f)
                lineTo(6f, 10f)
                lineTo(10f, 6f)
                lineTo(6f, 2f)
                close()
            }
        }.build()

        return _DbDisabledMethodBreakpointDark!!
    }

private var _DbDisabledMethodBreakpointDark: ImageVector? = null

