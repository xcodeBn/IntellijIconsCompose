package github.xcodebn.intellijiconscompose.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Showignored: ImageVector
    get() {
        if (_Showignored != null) return _Showignored!!

        _Showignored = ImageVector.Builder(
            name = "Showignored",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 12f)
                curveTo(6.30f, 12.25f, 7.12f, 12.50f, 8.00f, 12.50f)
                curveTo(10.49f, 12.50f, 12.50f, 10.49f, 12.50f, 8.00f)
                curveTo(12.50f, 7.12f, 12.25f, 6.30f, 11.81f, 5.60f)
                lineTo(6f, 12f)
                close()
                moveTo(4f, 10f)
                lineTo(10f, 4f)
                curveTo(9.70f, 3.75f, 8.88f, 3.50f, 8.00f, 3.50f)
                curveTo(5.51f, 3.50f, 3.50f, 5.51f, 3.50f, 8.00f)
                curveTo(3.50f, 8.88f, 3.75f, 9.70f, 4.19f, 10.40f)
                close()
                moveTo(8f, 14f)
                curveTo(4.41f, 14.50f, 1.50f, 11.59f, 1.50f, 8.00f)
                curveTo(1.50f, 4.41f, 4.41f, 1.50f, 8.00f, 1.50f)
                curveTo(11.59f, 1.50f, 14.50f, 4.41f, 14.50f, 8.00f)
                curveTo(14.50f, 11.59f, 11.59f, 14.50f, 8.00f, 14.50f)
                close()
            }
        }.build()

        return _Showignored!!
    }

private var _Showignored: ImageVector? = null

