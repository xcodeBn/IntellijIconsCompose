package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabpin: ImageVector
    get() {
        if (_Tabpin != null) return _Tabpin!!

        _Tabpin = ImageVector.Builder(
            name = "Tabpin",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 3f)
                curveTo(13.00f, 3.40f, 12.60f, 3.00f, 12.60f, 2.50f)
                curveTo(12.60f, 2.00f, 13.00f, 1.60f, 13.50f, 1.60f)
                curveTo(14.00f, 1.60f, 14.40f, 2.00f, 14.40f, 2.50f)
                curveTo(14.40f, 3.00f, 14.00f, 3.40f, 13.50f, 3.40f)
                moveTo(14f, 0f)
                curveTo(12.12f, 0.00f, 11.00f, 1.12f, 11.00f, 2.50f)
                curveTo(11.00f, 3.88f, 12.12f, 5.00f, 13.50f, 5.00f)
                curveTo(14.88f, 5.00f, 16.00f, 3.88f, 16.00f, 2.50f)
                curveTo(16.00f, 1.12f, 14.88f, 0.00f, 13.50f, 0.00f)
            }
        }.build()

        return _Tabpin!!
    }

private var _Tabpin: ImageVector? = null

