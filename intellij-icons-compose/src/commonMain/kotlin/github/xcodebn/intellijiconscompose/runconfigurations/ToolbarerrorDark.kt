package github.xcodebn.intellijiconscompose.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ToolbarerrorDark: ImageVector
    get() {
        if (_ToolbarerrorDark != null) return _ToolbarerrorDark!!

        _ToolbarerrorDark = ImageVector.Builder(
            name = "ToolbarerrorDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFC75450)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 14f)
                curveTo(4.41f, 14.50f, 1.50f, 11.59f, 1.50f, 8.00f)
                curveTo(1.50f, 4.41f, 4.41f, 1.50f, 8.00f, 1.50f)
                curveTo(11.59f, 1.50f, 14.50f, 4.41f, 14.50f, 8.00f)
                curveTo(14.50f, 11.59f, 11.59f, 14.50f, 8.00f, 14.50f)
                close()
                moveTo(7f, 4f)
                lineTo(7f, 8f)
                lineTo(9f, 8f)
                lineTo(9f, 4f)
                lineTo(7f, 4f)
                close()
                moveTo(7f, 10f)
                lineTo(7f, 12f)
                lineTo(9f, 12f)
                lineTo(9f, 10f)
                lineTo(7f, 10f)
                close()
            }
        }.build()

        return _ToolbarerrorDark!!
    }

private var _ToolbarerrorDark: ImageVector? = null

