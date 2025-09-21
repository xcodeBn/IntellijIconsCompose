package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Localization: ImageVector
    get() {
        if (_Localization != null) return _Localization!!

        _Localization = ImageVector.Builder(
            name = "Localization",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 11f)
                curveTo(6.55f, 10.58f, 5.09f, 9.34f, 5.06f, 9.37f)
                curveTo(4.28f, 9.98f, 3.47f, 10.54f, 2.61f, 11.04f)
                curveTo(2.10f, 11.34f, 1.58f, 11.41f, 1.26f, 10.98f)
                curveTo(1.21f, 10.90f, 1.17f, 10.80f, 1.14f, 10.71f)
                curveTo(1.12f, 10.61f, 1.12f, 10.51f, 1.14f, 10.41f)
                curveTo(1.16f, 10.32f, 1.20f, 10.22f, 1.25f, 10.14f)
                curveTo(1.31f, 10.06f, 1.38f, 9.99f, 1.46f, 9.94f)
                curveTo(1.47f, 9.93f, 3.27f, 8.75f, 3.88f, 8.23f)
                curveTo(3.17f, 7.47f, 2.61f, 6.58f, 2.22f, 5.61f)
                curveTo(2.15f, 5.43f, 2.15f, 5.22f, 2.22f, 5.03f)
                curveTo(2.29f, 4.84f, 2.43f, 4.69f, 2.61f, 4.60f)
                curveTo(3.00f, 4.43f, 3.39f, 4.50f, 3.72f, 5.06f)
                curveTo(4.04f, 5.84f, 4.50f, 6.57f, 5.06f, 7.20f)
                curveTo(5.83f, 6.26f, 6.38f, 5.16f, 6.66f, 3.98f)
                lineTo(1f, 4f)
                verticalLineTo(2f)
                horizontalLineTo(5f)
                verticalLineTo(2f)
                curveTo(4.57f, 1.64f, 4.58f, 1.55f, 4.62f, 1.46f)
                curveTo(4.66f, 1.37f, 4.71f, 1.29f, 4.78f, 1.22f)
                curveTo(4.85f, 1.15f, 4.93f, 1.09f, 5.02f, 1.06f)
                curveTo(5.11f, 1.02f, 5.20f, 1.00f, 5.30f, 1.00f)
                curveTo(5.40f, 1.00f, 5.49f, 1.02f, 5.58f, 1.06f)
                curveTo(5.67f, 1.09f, 5.75f, 1.15f, 5.82f, 1.22f)
                curveTo(5.89f, 1.29f, 5.94f, 1.37f, 5.98f, 1.46f)
                curveTo(6.01f, 1.55f, 6.03f, 1.64f, 6.03f, 1.74f)
                verticalLineTo(2f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                curveTo(7.94f, 5.50f, 7.27f, 6.95f, 6.36f, 8.23f)
                curveTo(6.89f, 8.69f, 7.46f, 9.11f, 8.06f, 9.46f)
                lineTo(10f, 5f)
                curveTo(9.84f, 5.10f, 9.95f, 4.96f, 10.09f, 4.86f)
                curveTo(10.24f, 4.76f, 10.41f, 4.71f, 10.59f, 4.71f)
                curveTo(10.76f, 4.71f, 10.94f, 4.76f, 11.08f, 4.86f)
                curveTo(11.22f, 4.97f, 11.33f, 5.11f, 11.39f, 5.28f)
                lineTo(14f, 11f)
                lineTo(15f, 14f)
                horizontalLineTo(13f)
                lineTo(12f, 12f)
                horizontalLineTo(9f)
                lineTo(8f, 14f)
                horizontalLineTo(6f)
                lineTo(6f, 13f)
                lineTo(7f, 11f)
                close()
                moveTo(11f, 7f)
                lineTo(9f, 11f)
                horizontalLineTo(12f)
                lineTo(11f, 7f)
                close()
            }
        }.build()

        return _Localization!!
    }

private var _Localization: ImageVector? = null

