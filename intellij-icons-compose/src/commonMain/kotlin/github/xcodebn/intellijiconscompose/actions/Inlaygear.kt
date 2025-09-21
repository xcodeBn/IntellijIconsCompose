package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Inlaygear: ImageVector
    get() {
        if (_Inlaygear != null) return _Inlaygear!!

        _Inlaygear = ImageVector.Builder(
            name = "Inlaygear",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 8f)
                lineTo(10f, 7f)
                curveTo(10.03f, 6.54f, 10.06f, 6.27f, 10.06f, 6.00f)
                curveTo(10.06f, 5.73f, 10.03f, 5.46f, 9.98f, 5.20f)
                lineTo(11f, 4f)
                curveTo(10.99f, 3.56f, 10.60f, 2.89f, 10.09f, 2.32f)
                lineTo(9f, 3f)
                curveTo(8.28f, 2.60f, 7.82f, 2.33f, 7.30f, 2.15f)
                lineTo(7f, 1f)
                curveTo(6.78f, 0.54f, 6.39f, 0.50f, 6.00f, 0.50f)
                curveTo(5.61f, 0.50f, 5.22f, 0.54f, 4.85f, 0.62f)
                lineTo(5f, 2f)
                curveTo(4.18f, 2.33f, 3.71f, 2.60f, 3.32f, 2.95f)
                lineTo(2f, 2f)
                curveTo(1.40f, 2.89f, 1.01f, 3.56f, 0.77f, 4.31f)
                lineTo(2f, 5f)
                curveTo(1.96f, 5.46f, 1.94f, 5.73f, 1.94f, 6.00f)
                curveTo(1.94f, 6.27f, 1.96f, 6.54f, 2.02f, 6.80f)
                lineTo(1f, 8f)
                curveTo(1.01f, 8.44f, 1.40f, 9.11f, 1.91f, 9.68f)
                lineTo(3f, 9f)
                curveTo(3.71f, 9.40f, 4.18f, 9.67f, 4.70f, 9.85f)
                lineTo(5f, 11f)
                curveTo(5.22f, 11.46f, 5.61f, 11.50f, 6.00f, 11.50f)
                curveTo(6.39f, 11.50f, 6.78f, 11.46f, 7.15f, 11.38f)
                lineTo(7f, 10f)
                curveTo(7.82f, 9.67f, 8.28f, 9.40f, 8.68f, 9.05f)
                lineTo(10f, 10f)
                curveTo(10.60f, 9.11f, 10.99f, 8.44f, 11.23f, 7.69f)
                close()
                moveTo(8f, 6f)
                curveTo(7.95f, 7.08f, 7.07f, 7.95f, 6.00f, 7.95f)
                curveTo(4.92f, 7.95f, 4.05f, 7.08f, 4.05f, 6.00f)
                curveTo(4.05f, 4.93f, 4.92f, 4.05f, 6.00f, 4.05f)
                curveTo(7.07f, 4.05f, 7.95f, 4.93f, 7.95f, 6.00f)
                close()
            }
        }.build()

        return _Inlaygear!!
    }

private var _Inlaygear: ImageVector? = null

