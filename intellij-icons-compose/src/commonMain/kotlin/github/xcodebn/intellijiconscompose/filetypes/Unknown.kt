package github.xcodebn.intellijiconscompose.filetypes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Unknown: ImageVector
    get() {
        if (_Unknown != null) return _Unknown!!

        _Unknown = ImageVector.Builder(
            name = "Unknown",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(11f, 15f)
                lineTo(3f, 15f)
                lineTo(3f, 6f)
                lineTo(8f, 6f)
                lineTo(8f, 1f)
                lineTo(13f, 1f)
                curveTo(12.99f, 2.85f, 12.98f, 4.52f, 12.98f, 6.00f)
                curveTo(10.78f, 6.01f, 9.00f, 7.80f, 9.00f, 10.00f)
                curveTo(9.00f, 10.23f, 9.04f, 10.57f, 9.13f, 11.01f)
                curveTo(9.76f, 11.01f, 10.39f, 11.01f, 11.00f, 11.01f)
                lineTo(11f, 15f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(12f, 16f)
                lineTo(14f, 16f)
                lineTo(14f, 14f)
                lineTo(12f, 14f)
                lineTo(12f, 16f)
                close()
                moveTo(13f, 7f)
                curveTo(11.34f, 7.00f, 10.00f, 8.34f, 10.00f, 10.00f)
                lineTo(12f, 10f)
                curveTo(11.50f, 9.18f, 12.18f, 8.50f, 13.00f, 8.50f)
                curveTo(13.82f, 8.50f, 14.50f, 9.18f, 14.50f, 10.00f)
                curveTo(14.50f, 11.50f, 12.25f, 11.31f, 12.25f, 13.75f)
                lineTo(14f, 14f)
                curveTo(13.75f, 12.06f, 16.00f, 11.88f, 16.00f, 10.00f)
                curveTo(16.00f, 8.34f, 14.66f, 7.00f, 13.00f, 7.00f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(7f, 1f)
                lineTo(3f, 5f)
                lineTo(7f, 5f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(11f, 15f)
                    lineTo(3f, 15f)
                    lineTo(3f, 6f)
                    lineTo(8f, 6f)
                    lineTo(8f, 1f)
                    lineTo(13f, 1f)
                    curveTo(12.99f, 2.85f, 12.98f, 4.52f, 12.98f, 6.00f)
                    curveTo(10.78f, 6.01f, 9.00f, 7.80f, 9.00f, 10.00f)
                    curveTo(9.00f, 10.23f, 9.04f, 10.57f, 9.13f, 11.01f)
                    curveTo(9.76f, 11.01f, 10.39f, 11.01f, 11.00f, 11.01f)
                    lineTo(11f, 15f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF40B6E0))
                ) {
                    moveTo(12f, 16f)
                    lineTo(14f, 16f)
                    lineTo(14f, 14f)
                    lineTo(12f, 14f)
                    lineTo(12f, 16f)
                    close()
                    moveTo(13f, 7f)
                    curveTo(11.34f, 7.00f, 10.00f, 8.34f, 10.00f, 10.00f)
                    lineTo(12f, 10f)
                    curveTo(11.50f, 9.18f, 12.18f, 8.50f, 13.00f, 8.50f)
                    curveTo(13.82f, 8.50f, 14.50f, 9.18f, 14.50f, 10.00f)
                    curveTo(14.50f, 11.50f, 12.25f, 11.31f, 12.25f, 13.75f)
                    lineTo(14f, 14f)
                    curveTo(13.75f, 12.06f, 16.00f, 11.88f, 16.00f, 10.00f)
                    curveTo(16.00f, 8.34f, 14.66f, 7.00f, 13.00f, 7.00f)
                    close()
                }
            }
        }.build()

        return _Unknown!!
    }

private var _Unknown: ImageVector? = null

