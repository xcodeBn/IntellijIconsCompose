package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DbMutedDepMethodBreakpointDark: ImageVector
    get() {
        if (_DbMutedDepMethodBreakpointDark != null) return _DbMutedDepMethodBreakpointDark!!

        _DbMutedDepMethodBreakpointDark = ImageVector.Builder(
            name = "DbMutedDepMethodBreakpointDark",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(0f, 6f)
                lineTo(2f, 6f)
                lineTo(6f, 10f)
                lineTo(10f, 6f)
                lineTo(6f, 2f)
                lineTo(6f, 0f)
                lineTo(12f, 6f)
                lineTo(6f, 12f)
                lineTo(-0f, 6f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(0f, 6f)
                    lineTo(2f, 6f)
                    lineTo(6f, 10f)
                    lineTo(10f, 6f)
                    lineTo(6f, 2f)
                    lineTo(6f, 0f)
                    lineTo(12f, 6f)
                    lineTo(6f, 12f)
                    lineTo(-0f, 6f)
                    close()
                }
            }
        }.build()

        return _DbMutedDepMethodBreakpointDark!!
    }

private var _DbMutedDepMethodBreakpointDark: ImageVector? = null

