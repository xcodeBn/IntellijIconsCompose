package github.xcodebn.intellijiconscompose.providers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Sun: ImageVector
    get() {
        if (_Sun != null) return _Sun!!

        _Sun = ImageVector.Builder(
            name = "Sun",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF389FD6)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 8f)
                moveTo(4f, 6f)
                curveTo(4.78f, 5.67f, 5.53f, 5.67f, 5.99f, 6.13f)
                lineTo(3f, 11f)
                moveTo(8f, 12f)
                curveTo(8.35f, 12.32f, 8.35f, 13.07f, 7.88f, 13.53f)
                lineTo(3f, 11f)
                moveTo(6f, 10f)
                curveTo(5.70f, 9.24f, 5.70f, 8.49f, 6.17f, 8.02f)
                lineTo(11f, 11f)
                moveTo(10f, 8f)
                curveTo(9.28f, 8.31f, 8.53f, 8.31f, 8.06f, 7.85f)
                lineTo(11f, 3f)
                moveTo(12f, 6f)
                curveTo(12.35f, 5.67f, 13.11f, 5.67f, 13.57f, 6.13f)
                lineTo(11f, 11f)
                moveTo(8f, 4f)
                curveTo(8.35f, 4.74f, 8.35f, 5.49f, 7.88f, 5.96f)
                lineTo(3f, 3f)
                moveTo(6f, 2f)
            }
        }.build()

        return _Sun!!
    }

private var _Sun: ImageVector? = null

