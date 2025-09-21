package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DbDisabledExceptionBreakpoint: ImageVector
    get() {
        if (_DbDisabledExceptionBreakpoint != null) return _DbDisabledExceptionBreakpoint!!

        _DbDisabledExceptionBreakpoint = ImageVector.Builder(
            name = "DbDisabledExceptionBreakpoint",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFDB5860))
            ) {
                moveTo(7f, 5f)
                lineTo(7f, 8f)
                lineTo(8f, 3f)
                lineTo(3f, 6f)
                lineTo(4f, 1f)
                lineTo(3f, 2f)
                lineTo(3f, 8f)
                lineTo(7f, 5f)
                close()
                moveTo(6f, 7f)
                lineTo(2f, 10f)
                lineTo(2f, 1f)
                lineTo(5f, -1f)
                lineTo(5f, 4f)
                lineTo(10f, 1f)
                lineTo(7f, 12f)
                lineTo(6f, 7f)
                close()
            }
        }.build()

        return _DbDisabledExceptionBreakpoint!!
    }

private var _DbDisabledExceptionBreakpoint: ImageVector? = null

