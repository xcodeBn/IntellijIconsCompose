package github.xcodebn.intellijiconscompose.providers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Azure: ImageVector
    get() {
        if (_Azure != null) return _Azure!!

        _Azure = ImageVector.Builder(
            name = "Azure",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF529FDB))
            ) {
                moveTo(6f, 10f)
                curveTo(8.28f, 9.95f, 9.76f, 9.68f, 9.78f, 9.68f)
                lineTo(10f, 10f)
                lineTo(8f, 8f)
                curveTo(7.18f, 6.54f, 6.41f, 5.63f, 6.41f, 5.62f)
                curveTo(6.41f, 5.61f, 8.17f, 0.79f, 8.18f, 0.77f)
                curveTo(8.18f, 0.76f, 9.37f, 2.82f, 11.07f, 5.76f)
                curveTo(12.66f, 8.51f, 13.97f, 10.78f, 13.98f, 10.81f)
                lineTo(14f, 11f)
                lineTo(9f, 11f)
                lineTo(3f, 11f)
                lineTo(6f, 10f)
                lineTo(6f, 10f)
                close()
                moveTo(-0f, 10f)
                curveTo(-0.00f, 9.65f, 0.80f, 8.26f, 1.78f, 6.56f)
                lineTo(4f, 3f)
                lineTo(6f, 2f)
                curveTo(6.77f, 0.79f, 7.70f, 0.00f, 7.71f, 0.00f)
                curveTo(7.71f, -0.00f, 7.70f, 0.04f, 7.67f, 0.08f)
                curveTo(7.65f, 0.13f, 6.64f, 2.30f, 5.42f, 4.91f)
                lineTo(3f, 10f)
                lineTo(2f, 10f)
                curveTo(0.72f, 9.65f, -0.00f, 9.65f, -0.00f, 9.65f)
                lineTo(-0f, 10f)
                close()
            }
        }.build()

        return _Azure!!
    }

private var _Azure: ImageVector? = null

