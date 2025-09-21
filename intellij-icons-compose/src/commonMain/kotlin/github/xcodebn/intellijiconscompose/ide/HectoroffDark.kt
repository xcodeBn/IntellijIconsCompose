package github.xcodebn.intellijiconscompose.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HectoroffDark: ImageVector
    get() {
        if (_HectoroffDark != null) return _HectoroffDark!!

        _HectoroffDark = ImageVector.Builder(
            name = "HectoroffDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 12f)
                curveTo(4.54f, 11.21f, 4.00f, 10.17f, 4.00f, 9.00f)
                lineTo(4f, 9f)
                lineTo(4f, 9f)
                curveTo(3.42f, 8.98f, 3.20f, 8.76f, 3.20f, 8.48f)
                lineTo(3f, 8f)
                curveTo(3.20f, 7.31f, 3.42f, 7.09f, 3.70f, 7.09f)
                lineTo(4f, 7f)
                curveTo(4.00f, 7.01f, 4.00f, 6.93f, 4.00f, 6.84f)
                lineTo(4f, 6f)
                lineTo(2f, 6f)
                lineTo(2f, 5f)
                lineTo(4f, 5f)
                lineTo(4f, 3f)
                curveTo(4.00f, 2.59f, 4.09f, 2.28f, 4.25f, 1.97f)
                curveTo(4.42f, 1.66f, 4.66f, 1.42f, 4.97f, 1.25f)
                curveTo(5.28f, 1.09f, 5.59f, 1.00f, 6.44f, 1.00f)
                lineTo(10f, 1f)
                curveTo(10.41f, 1.00f, 10.72f, 1.09f, 11.03f, 1.25f)
                curveTo(11.34f, 1.42f, 11.58f, 1.66f, 11.75f, 1.97f)
                curveTo(11.91f, 2.28f, 12.00f, 2.59f, 12.00f, 3.44f)
                lineTo(12f, 5f)
                lineTo(14f, 5f)
                lineTo(14f, 6f)
                lineTo(12f, 6f)
                lineTo(12f, 7f)
                curveTo(12.00f, 6.93f, 12.00f, 7.01f, 12.00f, 7.09f)
                lineTo(12f, 7f)
                curveTo(12.58f, 7.09f, 12.80f, 7.31f, 12.80f, 7.59f)
                lineTo(13f, 8f)
                curveTo(12.80f, 8.76f, 12.58f, 8.98f, 12.30f, 8.98f)
                lineTo(12f, 9f)
                lineTo(12f, 9f)
                curveTo(12.00f, 10.17f, 11.46f, 11.21f, 10.62f, 11.88f)
                curveTo(12.87f, 12.38f, 13.40f, 13.50f, 13.40f, 14.00f)
                lineTo(3f, 14f)
                curveTo(2.60f, 13.50f, 3.13f, 12.38f, 5.38f, 11.88f)
                close()
            }
        }.build()

        return _HectoroffDark!!
    }

private var _HectoroffDark: ImageVector? = null

