package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Private: ImageVector
    get() {
        if (_Private != null) return _Private!!

        _Private = ImageVector.Builder(
            name = "Private",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF26522)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 7f)
                lineTo(7f, 6f)
                curveTo(7.00f, 5.00f, 7.24f, 5.00f, 8.00f, 5.00f)
                curveTo(8.76f, 5.00f, 9.00f, 5.00f, 9.00f, 6.00f)
                lineTo(9f, 7f)
                lineTo(7f, 7f)
                close()
                moveTo(8f, 4f)
                curveTo(5.89f, 4.00f, 6.00f, 5.35f, 6.00f, 7.00f)
                lineTo(5f, 7f)
                lineTo(5f, 12f)
                lineTo(11f, 12f)
                lineTo(11f, 7f)
                curveTo(10.60f, 7.00f, 10.27f, 7.00f, 10.00f, 7.00f)
                curveTo(10.00f, 5.35f, 10.11f, 4.00f, 8.00f, 4.00f)
                close()
            }
        }.build()

        return _Private!!
    }

private var _Private: ImageVector? = null

