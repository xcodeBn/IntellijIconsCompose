package github.xcodebn.intellijiconscompose.ide.notification

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gearhover: ImageVector
    get() {
        if (_Gearhover != null) return _Gearhover!!

        _Gearhover = ImageVector.Builder(
            name = "Gearhover",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 9f)
                lineTo(14f, 10f)
                curveTo(13.90f, 10.88f, 13.43f, 11.68f, 12.83f, 12.35f)
                lineTo(11f, 12f)
                curveTo(10.70f, 12.02f, 10.14f, 12.34f, 9.53f, 12.55f)
                lineTo(9f, 14f)
                curveTo(8.92f, 14.45f, 8.46f, 14.50f, 8.00f, 14.50f)
                curveTo(7.53f, 14.50f, 7.08f, 14.45f, 6.64f, 14.36f)
                lineTo(6f, 13f)
                curveTo(5.85f, 12.34f, 5.30f, 12.02f, 4.82f, 11.60f)
                lineTo(3f, 12f)
                curveTo(2.56f, 11.68f, 2.09f, 10.88f, 1.81f, 10.00f)
                lineTo(3f, 9f)
                curveTo(3.23f, 8.64f, 3.20f, 8.32f, 3.20f, 8.00f)
                curveTo(3.20f, 7.68f, 3.23f, 7.36f, 3.29f, 7.06f)
                lineTo(2f, 6f)
                curveTo(2.09f, 5.12f, 2.56f, 4.32f, 3.17f, 3.65f)
                lineTo(5f, 4f)
                curveTo(5.30f, 3.98f, 5.85f, 3.66f, 6.46f, 3.45f)
                lineTo(7f, 2f)
                curveTo(7.08f, 1.55f, 7.53f, 1.50f, 8.00f, 1.50f)
                curveTo(8.46f, 1.50f, 8.92f, 1.55f, 9.35f, 1.64f)
                lineTo(10f, 3f)
                curveTo(10.14f, 3.66f, 10.70f, 3.98f, 11.17f, 4.40f)
                lineTo(13f, 4f)
                curveTo(13.43f, 4.32f, 13.90f, 5.12f, 14.18f, 6.00f)
                lineTo(13f, 7f)
                curveTo(12.76f, 7.36f, 12.80f, 7.68f, 12.80f, 8.00f)
                curveTo(12.80f, 8.32f, 12.76f, 8.64f, 12.70f, 8.94f)
                close()
                moveTo(8f, 10f)
                curveTo(9.27f, 10.30f, 10.30f, 9.27f, 10.30f, 8.00f)
                curveTo(10.30f, 6.73f, 9.27f, 5.70f, 8.00f, 5.70f)
                curveTo(6.73f, 5.70f, 5.70f, 6.73f, 5.70f, 8.00f)
                curveTo(5.70f, 9.27f, 6.73f, 10.30f, 8.00f, 10.30f)
                close()
            }
        }.build()

        return _Gearhover!!
    }

private var _Gearhover: ImageVector? = null

