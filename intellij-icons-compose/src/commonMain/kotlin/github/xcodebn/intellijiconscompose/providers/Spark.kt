package github.xcodebn.intellijiconscompose.providers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Spark: ImageVector
    get() {
        if (_Spark != null) return _Spark!!

        _Spark = ImageVector.Builder(
            name = "Spark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFD2642C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 11f)
                lineTo(6f, 15f)
                curveTo(5.74f, 15.07f, 5.07f, 15.12f, 4.62f, 14.75f)
                curveTo(4.35f, 14.52f, 4.22f, 14.18f, 4.26f, 13.84f)
                lineTo(5f, 10f)
                lineTo(2f, 9f)
                curveTo(1.12f, 8.48f, 0.86f, 7.87f, 1.08f, 7.34f)
                curveTo(1.20f, 7.05f, 1.44f, 6.83f, 1.74f, 6.74f)
                lineTo(6f, 6f)
                lineTo(6f, 2f)
                curveTo(6.26f, 1.31f, 6.81f, 0.92f, 7.39f, 1.01f)
                curveTo(7.70f, 1.06f, 7.98f, 1.24f, 8.14f, 1.51f)
                lineTo(10f, 4f)
                lineTo(14f, 3f)
                curveTo(14.19f, 3.02f, 14.79f, 3.34f, 14.96f, 3.89f)
                curveTo(15.06f, 4.23f, 14.98f, 4.60f, 14.74f, 4.87f)
                lineTo(12f, 8f)
                lineTo(14f, 11f)
                curveTo(13.91f, 11.58f, 13.72f, 12.21f, 13.20f, 12.48f)
                curveTo(12.93f, 12.62f, 12.62f, 12.65f, 12.33f, 12.55f)
                lineTo(9f, 11f)
                close()
                moveTo(9f, 10f)
                lineTo(12f, 11f)
                lineTo(10f, 8f)
                lineTo(13f, 5f)
                lineTo(9f, 6f)
                lineTo(7f, 3f)
                lineTo(7f, 7f)
                lineTo(3f, 8f)
                lineTo(6f, 9f)
                lineTo(6f, 13f)
                lineTo(9f, 10f)
                close()
            }
        }.build()

        return _Spark!!
    }

private var _Spark: ImageVector? = null

