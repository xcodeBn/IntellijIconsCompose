package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Search: ImageVector
    get() {
        if (_Search != null) return _Search!!

        _Search = ImageVector.Builder(
            name = "Search",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 10f)
                lineTo(14f, 13f)
                lineTo(13f, 14f)
                lineTo(10f, 11f)
                curveTo(9.15f, 11.63f, 8.12f, 12.00f, 7.00f, 12.00f)
                curveTo(4.24f, 12.00f, 2.00f, 9.76f, 2.00f, 7.00f)
                curveTo(2.00f, 4.24f, 4.24f, 2.00f, 7.00f, 2.00f)
                curveTo(9.76f, 2.00f, 12.00f, 4.24f, 12.00f, 7.00f)
                curveTo(12.00f, 8.10f, 11.64f, 9.12f, 11.04f, 9.95f)
                close()
                moveTo(7f, 11f)
                curveTo(9.21f, 11.00f, 11.00f, 9.21f, 11.00f, 7.00f)
                curveTo(11.00f, 4.79f, 9.21f, 3.00f, 7.00f, 3.00f)
                curveTo(4.79f, 3.00f, 3.00f, 4.79f, 3.00f, 7.00f)
                curveTo(3.00f, 9.21f, 4.79f, 11.00f, 7.00f, 11.00f)
                close()
            }
        }.build()

        return _Search!!
    }

private var _Search: ImageVector? = null

