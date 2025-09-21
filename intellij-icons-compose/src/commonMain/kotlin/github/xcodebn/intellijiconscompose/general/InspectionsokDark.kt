package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val InspectionsokDark: ImageVector
    get() {
        if (_InspectionsokDark != null) return _InspectionsokDark!!

        _InspectionsokDark = ImageVector.Builder(
            name = "InspectionsokDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF499C54)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 12f)
                lineTo(14f, 5f)
                lineTo(12f, 3f)
                lineTo(7f, 8f)
                lineTo(4f, 6f)
                lineTo(2f, 8f)
                lineTo(7f, 12f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF499C54)),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(7f, 12f)
                    lineTo(14f, 5f)
                    lineTo(12f, 3f)
                    lineTo(7f, 8f)
                    lineTo(4f, 6f)
                    lineTo(2f, 8f)
                    lineTo(7f, 12f)
                    close()
                }
            }
        }.build()

        return _InspectionsokDark!!
    }

private var _InspectionsokDark: ImageVector? = null

