package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Unknown: ImageVector
    get() {
        if (_Unknown != null) return _Unknown!!

        _Unknown = ImageVector.Builder(
            name = "Unknown",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 14f)
                lineTo(9f, 14f)
                lineTo(9f, 12f)
                lineTo(7f, 12f)
                lineTo(7f, 14f)
                close()
                moveTo(8f, 2f)
                curveTo(5.79f, 2.00f, 4.00f, 3.79f, 4.00f, 6.00f)
                lineTo(6f, 6f)
                curveTo(6.00f, 4.90f, 6.90f, 4.00f, 8.00f, 4.00f)
                curveTo(9.10f, 4.00f, 10.00f, 4.90f, 10.00f, 6.00f)
                curveTo(10.00f, 8.00f, 7.00f, 7.75f, 7.00f, 11.00f)
                lineTo(9f, 11f)
                curveTo(9.00f, 8.75f, 12.00f, 8.50f, 12.00f, 6.00f)
                curveTo(12.00f, 3.79f, 10.21f, 2.00f, 8.00f, 2.00f)
                close()
            }
        }.build()

        return _Unknown!!
    }

private var _Unknown: ImageVector? = null

