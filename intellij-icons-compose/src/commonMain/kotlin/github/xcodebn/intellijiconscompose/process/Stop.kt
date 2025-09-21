package github.xcodebn.intellijiconscompose.process

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Stop: ImageVector
    get() {
        if (_Stop != null) return _Stop!!

        _Stop = ImageVector.Builder(
            name = "Stop",
            defaultWidth = 14.0.dp,
            defaultHeight = 14.0.dp,
            viewportWidth = 14.0f,
            viewportHeight = 14.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 6f)
                lineTo(8f, 2f)
                lineTo(6f, 2f)
                lineTo(6f, 6f)
                lineTo(2f, 6f)
                lineTo(2f, 8f)
                lineTo(6f, 8f)
                lineTo(6f, 12f)
                lineTo(8f, 12f)
                lineTo(8f, 8f)
                lineTo(12f, 8f)
                lineTo(12f, 6f)
                lineTo(8f, 6f)
                close()
                moveTo(7f, 14f)
                curveTo(3.13f, 14.00f, 0.00f, 10.87f, 0.00f, 7.00f)
                curveTo(0.00f, 3.13f, 3.13f, 0.00f, 7.00f, 0.00f)
                curveTo(10.87f, 0.00f, 14.00f, 3.13f, 14.00f, 7.00f)
                curveTo(14.00f, 10.87f, 10.87f, 14.00f, 7.00f, 14.00f)
                close()
            }
        }.build()

        return _Stop!!
    }

private var _Stop: ImageVector? = null

