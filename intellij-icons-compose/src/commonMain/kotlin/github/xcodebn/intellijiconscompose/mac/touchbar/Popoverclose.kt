package github.xcodebn.intellijiconscompose.mac.touchbar

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Popoverclose: ImageVector
    get() {
        if (_Popoverclose != null) return _Popoverclose!!

        _Popoverclose = ImageVector.Builder(
            name = "Popoverclose",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 15f)
                curveTo(16.61f, 15.04f, 16.61f, 15.74f, 16.17f, 16.18f)
                curveTo(15.74f, 16.61f, 15.04f, 16.61f, 14.61f, 16.17f)
                lineTo(12f, 14f)
                lineTo(9f, 16f)
                curveTo(8.96f, 16.61f, 8.26f, 16.61f, 7.82f, 16.18f)
                curveTo(7.39f, 15.74f, 7.39f, 15.04f, 7.83f, 14.61f)
                lineTo(10f, 12f)
                lineTo(8f, 9f)
                curveTo(7.39f, 8.96f, 7.39f, 8.26f, 7.82f, 7.83f)
                curveTo(8.26f, 7.39f, 8.95f, 7.39f, 9.39f, 7.83f)
                lineTo(12f, 10f)
                lineTo(15f, 8f)
                curveTo(15.04f, 7.39f, 15.74f, 7.39f, 16.17f, 7.83f)
                curveTo(16.61f, 8.26f, 16.61f, 8.95f, 16.17f, 9.39f)
                lineTo(14f, 12f)
                lineTo(16f, 15f)
                close()
                moveTo(12f, 2f)
                curveTo(6.20f, 1.50f, 1.50f, 6.20f, 1.50f, 12.00f)
                curveTo(1.50f, 17.80f, 6.20f, 22.50f, 12.00f, 22.50f)
                curveTo(17.80f, 22.50f, 22.50f, 17.80f, 22.50f, 12.00f)
                curveTo(22.50f, 6.20f, 17.80f, 1.50f, 12.00f, 1.50f)
                lineTo(12f, 2f)
                close()
            }
        }.build()

        return _Popoverclose!!
    }

private var _Popoverclose: ImageVector? = null

