package github.xcodebn.intellijiconscompose.toolbardecorator

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AddblanklineDark: ImageVector
    get() {
        if (_AddblanklineDark != null) return _AddblanklineDark!!

        _AddblanklineDark = ImageVector.Builder(
            name = "AddblanklineDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(9f, 10f)
                lineTo(12f, 16f)
                lineTo(11f, 16f)
                lineTo(8f, 10f)
                lineTo(9f, 10f)
                close()
                moveTo(12f, 11f)
                lineTo(13f, 11f)
                lineTo(13f, 12f)
                curveTo(13.05f, 11.69f, 13.07f, 11.00f, 14.37f, 11.00f)
                curveTo(16.00f, 11.00f, 16.00f, 12.51f, 16.00f, 12.98f)
                lineTo(16f, 16f)
                lineTo(15f, 16f)
                lineTo(15f, 13f)
                curveTo(15.00f, 12.75f, 14.87f, 11.89f, 14.09f, 11.88f)
                curveTo(13.19f, 11.87f, 13.00f, 13.23f, 13.00f, 13.53f)
                lineTo(13f, 16f)
                lineTo(12f, 16f)
                lineTo(12f, 11f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(9f, 10f)
                    lineTo(12f, 16f)
                    lineTo(11f, 16f)
                    lineTo(8f, 10f)
                    lineTo(9f, 10f)
                    close()
                    moveTo(12f, 11f)
                    lineTo(13f, 11f)
                    lineTo(13f, 12f)
                    curveTo(13.05f, 11.69f, 13.07f, 11.00f, 14.37f, 11.00f)
                    curveTo(16.00f, 11.00f, 16.00f, 12.51f, 16.00f, 12.98f)
                    lineTo(16f, 16f)
                    lineTo(15f, 16f)
                    lineTo(15f, 13f)
                    curveTo(15.00f, 12.75f, 14.87f, 11.89f, 14.09f, 11.88f)
                    curveTo(13.19f, 11.87f, 13.00f, 13.23f, 13.00f, 13.53f)
                    lineTo(13f, 16f)
                    lineTo(12f, 16f)
                    lineTo(12f, 11f)
                    close()
                }
            }
        }.build()

        return _AddblanklineDark!!
    }

private var _AddblanklineDark: ImageVector? = null

