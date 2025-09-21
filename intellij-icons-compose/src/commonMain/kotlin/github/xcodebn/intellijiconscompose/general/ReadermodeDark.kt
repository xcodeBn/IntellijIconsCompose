package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ReadermodeDark: ImageVector
    get() {
        if (_ReadermodeDark != null) return _ReadermodeDark!!

        _ReadermodeDark = ImageVector.Builder(
            name = "ReadermodeDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(2f, 3f)
                curveTo(2.82f, 3.09f, 3.54f, 3.00f, 4.23f, 3.00f)
                curveTo(5.37f, 3.00f, 6.65f, 3.45f, 7.50f, 4.10f)
                curveTo(7.50f, 6.98f, 7.50f, 11.85f, 7.50f, 13.21f)
                curveTo(6.71f, 12.72f, 5.22f, 12.09f, 4.23f, 12.09f)
                curveTo(3.26f, 12.09f, 2.26f, 12.27f, 1.44f, 12.71f)
                curveTo(1.25f, 12.80f, 1.00f, 12.66f, 1.00f, 12.44f)
                verticalLineTo(4f)
                curveTo(1.35f, 3.62f, 1.73f, 3.44f, 2.17f, 3.29f)
                close()
                moveTo(2f, 11f)
                curveTo(3.15f, 10.69f, 3.52f, 10.61f, 4.23f, 10.61f)
                curveTo(5.22f, 10.61f, 6.01f, 10.86f, 6.80f, 11.35f)
                verticalLineTo(5f)
                curveTo(6.15f, 4.81f, 5.22f, 4.37f, 4.23f, 4.37f)
                curveTo(3.52f, 4.37f, 3.00f, 4.50f, 2.50f, 4.75f)
                verticalLineTo(11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(13f, 3f)
                curveTo(12.18f, 3.09f, 11.46f, 3.00f, 10.77f, 3.00f)
                curveTo(9.63f, 3.00f, 8.35f, 3.45f, 7.50f, 4.10f)
                curveTo(7.50f, 6.98f, 7.50f, 11.85f, 7.50f, 13.21f)
                curveTo(8.29f, 12.72f, 9.78f, 12.09f, 10.77f, 12.09f)
                curveTo(11.74f, 12.09f, 12.74f, 12.27f, 13.56f, 12.71f)
                curveTo(13.75f, 12.80f, 14.00f, 12.66f, 14.00f, 12.44f)
                verticalLineTo(4f)
                curveTo(13.65f, 3.62f, 13.27f, 3.44f, 12.83f, 3.29f)
                close()
                moveTo(12f, 11f)
                curveTo(11.85f, 10.69f, 11.48f, 10.61f, 10.77f, 10.61f)
                curveTo(9.78f, 10.61f, 8.99f, 10.86f, 8.20f, 11.35f)
                verticalLineTo(5f)
                curveTo(8.85f, 4.81f, 9.78f, 4.37f, 10.77f, 4.37f)
                curveTo(11.48f, 4.37f, 12.00f, 4.50f, 12.50f, 4.75f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _ReadermodeDark!!
    }

private var _ReadermodeDark: ImageVector? = null

